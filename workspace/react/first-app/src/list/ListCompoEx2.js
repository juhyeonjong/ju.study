import React,{useEffect, useRef,useState} from "react";

const boardList = [{
  bno : 1,
  btitle : '첫번째 게시글 제목',
  bwriter: '홍길동',
  brdate : '2024-03-15',
  bhit : 10,
  bcontent:'첫번째 게시글 내용'
},{
  bno : 2,
  btitle : '두번째 게시글 제목',
  bwriter: '고길동',
  brdate : '2024-03-15',
  bhit : 10,
  bcontent:'두번째 게시글 내용'
},{
  bno : 3,
  btitle : '세번째 게시글 제목',
  bwriter: '이길동',
  brdate : '2024-03-15',
  bhit : 10,
  bcontent:'세번째 게시글 내용'
},{
  bno : 4,
  btitle : '네번째 게시글 제목',
  bwriter: '홍길동',
  brdate : '2024-03-15',
  bhit : 10,
  bcontent:'네번째 게시글 내용'
},{
  bno : 5,
  btitle : '다섯번째 게시글 제목',
  bwriter: '고길동',
  brdate : '2024-03-15',
  bhit : 10,
  bcontent:'다섯번째 게시글 내용'
}]

function ListCompoEx2(props){
  const btitle = useRef(null);
  const bwriter = useRef(null);
  const bcontent = useRef(null);
  const brdate = useRef(null);

  const [boards,setBoards] = useState(boardList);

  function addFn(){
    const btitleVal = btitle.current.value;
    const bwriterVal = bwriter.current.value;
    const bcontentVal = bcontent.current.value;
    const brdateVal = brdate.current.value;

    btitle.current.value= "";
    bwriter.current.value= "";
    bcontent.current.value= "";
    brdate.current.value= "";
    
    const board = {
      bno : boards.length+1,
      btitle : btitleVal,
      bwriter : bwriterVal,
      bcontent : bcontentVal,
      brdate : brdateVal,
      bhit : 0
    } 

    setBoards([...boards,board]); 
 
  }

  return(
    <>
    <table>
      <tbody>
        <tr>
          <th align="right">제목 : </th>
          <td><input type="text" ref={btitle} /></td>
          <td align="right" rowSpan={4} style={{verticalAlign:"bottom"}}>
            <button onClick={addFn}>추가</button>
          </td>
        </tr>
        <tr>
          <th align="right">작성자 : </th>
          <td><input type="text" ref={bwriter} /></td>
        </tr>
        <tr>
          <th align="right">내용 : </th>
          <td><input type="text" ref={bcontent}/></td>
        </tr>
        <tr>
          <th align="right">작성일 : </th>
          <td><input type="text" ref={brdate}/></td>
        </tr>
      </tbody>
    </table>
    <table border={1}>
      <thead>
        <tr>
          <th>글번호</th>
          <th>글제목</th>
          <th>작성자</th>
          <th>작성일</th>
        </tr>
      </thead> 
      <tbody>
      {
        boards.map((board)=>{
          return (
            <tr key={board.bno}>
              <td>{board.bno}</td>
              <td>{board.btitle}</td>
              <td>{board.bwriter}</td>
              <td>{board.brdate}</td>
            </tr>
          );
        })
      }
      </tbody>
    </table>
    </>
  );
}

export default ListCompoEx2;