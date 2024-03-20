import React,{useState} from "react";

function StateCompoFn(props){
  const [data,setData] = useState("초기값");

  let count = 0;
  return (
    <>
      <div>{data}</div>
      <button onClick={()=>{setData('변경됨!');}}>data 변경!</button>
      <button onClick={()=>{count++; console.log(count);}}>click!</button>
      <div>클릭 횟수 : {count}</div>
    </>
  );
}

export default StateCompoFn;