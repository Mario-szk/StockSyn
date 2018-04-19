package personal.xuzj157.stocksyn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import personal.xuzj157.stocksyn.pojo.po.HqInfo;

@Repository
public interface HqInfoRepository extends JpaRepository<HqInfo, String>, JpaSpecificationExecutor {

}
