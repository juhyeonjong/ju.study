function Box(){
  const title = 'div';
  const element = <h3>{title+' 요소입니다.'}</h3>;

  function clickFn(){
    alert('클릭했습니다!');
  }

  return (
    <div onClick={clickFn}>
      {element}
    </div>
    );
}

export default Box;