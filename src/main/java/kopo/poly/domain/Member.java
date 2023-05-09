package kopo.poly.domain;

public class Member {
    private Long id;     //시스템이 데이터를 구분하기 위해 임의로 부여하는 id
    private String name; //회원이 회원가입시 입력

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
