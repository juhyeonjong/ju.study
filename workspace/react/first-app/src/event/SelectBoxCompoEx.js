import React,{useState} from "react";
import ImageBoxCompo from "./ImageBoxCompoEx";

function SelectBoxCompoEx(props){
  const [selOption, setSelOption] = useState('banana.png');

  return(
    <>
      <select onChange={(event)=>{setSelOption(event.target.value)}}>
        <option value={'banana.png'}>바나나</option>
        <option value={'apple.png'}>사과</option>
        <option value={'mango.png'}>망고</option>
      </select>
      <ImageBoxCompo src={selOption} />
    </>
  )
}

export default SelectBoxCompoEx;