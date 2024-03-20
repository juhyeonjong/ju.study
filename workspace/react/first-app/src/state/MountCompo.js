import React from "react";

class MountCompo extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      data : ''
    }
  }

  componentDidMount(){
    console.log("출생!");
    this.setState({data:"출생!!"})
  }

  componentDidUpdate(){
    console.log("업데이트!");
    //this.setState({add:"추가"}); 무한루프
  }
  componentWillUnmount(){
    console.log("사라짐!");
  }

  render(){
    return (
      <div>
        Component!!<br></br>
        data : {this.state.data}
        <br></br>
        <button onClick={()=>{this.setState({data:"변경!"})}}>click!!</button>
      </div>
    );
  }
}
export default MountCompo;