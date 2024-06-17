package cpm.ofgiraffers.section02.uses;

public class MemberFinder {

    public Member[] findAllMembers(){
        return MemberRespositoy.findAllMembers();
        // 레파지토리에 있는 findAllMembers로 이동
    }
}
