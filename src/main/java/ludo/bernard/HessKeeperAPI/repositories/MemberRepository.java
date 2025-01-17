package ludo.bernard.HessKeeperAPI.repositories;

import java.lang.reflect.Member;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import ludo.bernard.HessKeeperAPI.dto.user.MemberId;

@Component
public interface MemberRepository extends CrudRepository<Member, MemberId>{}
