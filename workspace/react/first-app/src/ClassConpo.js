import React from "react";

class ClassConpo extends React.Component{
    //컴포넌트가 가지고 있는 메소드
    render(){
        return <h3>{this.props.title}</h3>
    }
}

export default ClassConpo;