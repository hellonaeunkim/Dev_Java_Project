## 명언 앱 (Wise Saying App)


<br>


- ### 프로젝트 개요
  이 프로젝트는 명언을 등록, 수정, 삭제, 조회하고, 파일로 데이터를 영구 저장하며, JSON 파일로 빌드하는 명언 관리 애플리케이션입니다. 사용자는 명령어 기반 인터페이스를 통해 명언을 관리할 수 있습니다.



<br>




- ### 주요 기능
1. 명언 등록: 명언과 작가를 입력하여 새로운 명언을 추가합니다.
  - 등록 시 고유 번호가 부여됩니다.
2. 명언 목록: 현재 저장된 모든 명언을 번호, 작가, 내용과 함께 역순으로 표시합니다. 
3. 명언 삭제: 고유 번호를 기준으로 특정 명언을 삭제합니다.
  - 삭제하려는 번호가 존재하지 않으면 예외 메시지를 출력합니다.
4. 명언 수정: 특정 명언의 내용과 작가를 수정할 수 있습니다.
5. 파일 저장: 각 명언은 JSON 파일({번호}.json)로 저장되며, 가장 마지막 ID는 lastId.txt에 저장됩니다.
6. 데이터 빌드: 현재 저장된 모든 명언 데이터를 data.json 파일로 빌드합니다.
7. 파일 기반 영속성: 애플리케이션 종료 후에도 데이터가 유지됩니다.




<br>



- ### 사용법
1. 애플리케이션을 실행합니다.
2. 명령어를 입력하여 다음과 같은 작업을 수행합니다:
- **등록** : 새로운 명언을 추가합니다.
- **목록** : 저장된 명언을 조회합니다.
- **삭제?id=<번호>** : 특정 명언을 삭제합니다.
- **수정?id=<번호>** : 특정 명언을 수정합니다.
- **빌드** : 모든 명언 데이터를 JSON 파일(data.json)로 출력합니다.
- **종료** : 프로그램을 종료합니다.