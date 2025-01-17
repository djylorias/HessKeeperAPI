package ludo.bernard.HessKeeperAPI.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import ludo.bernard.HessKeeperAPI.dto.user.Member;
import ludo.bernard.HessKeeperAPI.dto.user.MemberId;

@Component
public interface MemberRepository extends CrudRepository<Member, MemberId>{}
