import React,{useState} from "react";

function MouseEventEx(props){
  const [message,setMessage] = useState('');

  return (
    <div>
      <div onMouseOver={()=>{setMessage('마우스 오버됨')}} 
           onMouseOut={()=>{setMessage('')}}
           style={{width:200,height:100,border:"1px solid black"}}></div>
      {message}
    </div>
  );
}

export default MouseEventEx;