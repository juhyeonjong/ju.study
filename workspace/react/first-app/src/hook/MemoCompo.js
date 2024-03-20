import React,{useMemo, useState} from "react";

function MemoCompo(props){
  const [num1, setNum1] = useState(1);

  useMemo(()=>{clickFn()},[num1]);
  
  function clickFn(){
    console.log("클릭!");
  }

  return (
    <div>
      <button onClick={()=>{setNum1(num1+1)}}>click</button>
      <div>
        num1 : {num1}
      </div>
    </div>
  )
}

export default MemoCompo;