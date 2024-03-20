import React from "react";

class StateCompo1 extends React.Component{
  constructor(props){
    super(props);
    this.state ={
      data : "data1",
      count : 0
    };
  }

  render(){
    return (
      <>
        <div>{this.state.data}</div>
        <button onClick={()=>{this.setState({data:"변경!"});}}>click!!</button>
        <br/>
        <button onClick={()=>{this.setState({count:this.state.count+1});}}>addCount!!</button>
        <div>{this.state.count}</div>
      </>
    );
  }


}

export default StateCompo1;