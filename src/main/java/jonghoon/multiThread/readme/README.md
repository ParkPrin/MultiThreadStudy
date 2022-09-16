# Worker Thread 패턴
## 패턴요약
- 요청을 받는 것과 요청을 처리하는 것을 분리한다
    - 요청 받는 것을 인수(invocation), 요청을 처리하는 것을 실행(execution)으로 분리한다
- 요청을 담는 컨테이너는 Queue로 사용한다
- 요청을 처리하는 쓰레드를 n개 발행한다


## 다이어그램
![다이어그램](Worker_Thread_classDiagram.drawio.svg)
