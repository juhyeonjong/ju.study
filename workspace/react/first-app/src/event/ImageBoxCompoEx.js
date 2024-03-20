
function ImageBoxCompoEx(props){

  return (
    <div>
      선택한 이미지 :
      <img width={100} height={100} src={props.src} alt=""/>
    </div>
  );
}

export default ImageBoxCompoEx;