import React,{useState} from "react";
import MountCompo from "./MountCompo";

function ParentCompo(props){
  const [isShow, setIsShow] = useState(false);

  return (
    <div>
      <button onClick={()=>{setIsShow(true)}}>show</button>
      <button onClick={()=>{setIsShow(false)}}>hide</button>
      <hr></hr>
      {isShow && <MountCompo/>}
    </div>
  );

}

export default ParentCompo;