
function ImPureCompo(props){
 //props에는 data라는 옵션이 존재한다.
  let count = 1;

  function cntfn(){
    props.data = count+"번 클릭했습니다.";
    count++;
  }

  return (
    <div onClick={cntfn}>
      {props.data}
    </div>
  );
}

export default ImPureCompo;