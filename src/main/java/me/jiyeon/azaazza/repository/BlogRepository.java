package me.jiyeon.azaazza.repository;

import me.jiyeon.azaazza.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
