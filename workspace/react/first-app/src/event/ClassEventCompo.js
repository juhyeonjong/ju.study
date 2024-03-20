import React from "react";

class ClassEventCompo extends React.Component{
  constructor(props){
    super(props)
    this.state = {
      isClicked : false
    }
    //this.clickFn = this.clickFn.bind(this);
  }

  clickFn(name, age, e){
    alert(1);
    this.setState({isClicked : true});
    console.log(name,age);
    console.log(e.target);
  }

  //<button onClick={this.clickFn.bind(this)}>click!</button>
  // <button onClick={()=>{this.clickFn()}}>click!</button>
  //<button onClick={this.clickFn.bind(this,"홍길동","20")}>click!</button>
  render(){
    return (
    <div>
     <button onClick={(event)=>{
      this.clickFn("홍길동","20",event);
     }}>click!</button>
      <div>
        {this.state.isClicked && '클릭함!'}
      </div>
    </div>
    )
  }

}

export default ClassEventCompo;