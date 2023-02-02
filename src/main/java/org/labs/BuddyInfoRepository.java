package org.labs;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Integer> {
    List<BuddyInfo> findBuddyInfoByName(String name);
    BuddyInfo findBuddyInfoById(int id);

}
