import React,{useState} from "react";

function ChangeEvent(props){
  const [selval, setSelval] = useState('바나나');

  function chageSelFn(e){
    const value = e.target.value;
    setSelval(value);
  }
  return (
    <div>
      <select onChange={(event)=>{chageSelFn(event);}}>
        <option>바나나</option>
        <option>사과</option>
        <option>망고</option>
      </select>
      <span>{selval}</span>
    </div>
  );

}

export default ChangeEvent;