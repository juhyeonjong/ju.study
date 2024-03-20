import React,{useState} from "react";

function FormCompo(props){
  const [text,setText] = useState("");
  const [number,setNumber] = useState("");
  const [isClicked, setIsClicked] = useState(false);

  return (
    <>
    <input type="text" value={text} onChange={(event)=>{setText(event.target.value)}} />
    <input type="number" value={number} onChange={(event)=>{setNumber(event.target.value)}}/>
    <button onClick={()=>{setIsClicked(true)}}>click</button>
    <div>
      {isClicked && `${text}/${number}`}
    </div>
    </>
  )

}

export default FormCompo;