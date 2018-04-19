package personal.xuzj157.stocksyn.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import personal.xuzj157.stocksyn.pojo.po.Symbol;

import java.util.List;

@Repository
public interface SymbolRepository extends PagingAndSortingRepository<Symbol, String> {
    @Query("SELECT stockCode, exchange FROM Symbol")
    List<Symbol> findALL();
}
