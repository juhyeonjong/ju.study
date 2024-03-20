
import React,{useEffect, useRef,useState} from "react";

const menus = ['커피','탄산','티'];
function Menu(props){
  const menuInput = useRef(null);
  const [menuState,setMenuState] =  useState(menus);

  let cnt =0;
  function addMenuFn(){
    const value = menuInput.current.value;
    setMenuState([...menuState,value]);
  }

  useEffect(()=>{alert('menu변경!')},[menuState])

  return (
    <>
    메뉴 : <input type="text" ref={menuInput} />
    <button onClick={addMenuFn}>추가</button>
    <table border={1}>
      <tbody>
      {menuState.map(function(item){
        cnt++;
        return <tr key={cnt}><td>{item}</td></tr>
      })}
      </tbody>
    </table>
    </>
  );
}

export default Menu;