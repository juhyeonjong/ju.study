import React,{useEffect, useState} from "react";

function EffactCompo(props){
  const [count,setCount] = useState(0);
  const [data,setData] =  useState("");

  useEffect(()=>{
    document.title = `${count}번 클릭했습니다.`;
    console.log("이팩트 실행!");
  },[count]);

  useEffect(()=>{
    console.log(data+" 변경!");
  },[data]);

  return(
    <div>
      <div>{count} 번 클릭했습니다.</div>
      <button onClick={()=>{setCount(count+1)}}>click!!</button>
      <button onClick={()=>{setData('클릭!')}}>click2!!</button>
      <div>{data}</div>
    </div>
  );
}

export default EffactCompo;