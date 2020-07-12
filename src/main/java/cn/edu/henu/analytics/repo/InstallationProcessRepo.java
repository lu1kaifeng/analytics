package cn.edu.henu.analytics.repo;

import cn.edu.henu.analytics.entity.InstallationProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstallationProcessRepo extends JpaRepository<InstallationProcess,Long> {
}
