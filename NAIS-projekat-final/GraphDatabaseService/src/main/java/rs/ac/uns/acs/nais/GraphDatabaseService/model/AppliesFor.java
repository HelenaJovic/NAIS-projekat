package rs.ac.uns.acs.nais.GraphDatabaseService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.RelationshipId;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

import java.time.LocalDate;

@RelationshipProperties
public class AppliesFor {
    @RelationshipId
    private  Long id;

    private Integer points;
    private LocalDate applicationDate;
    @TargetNode
    private  ApplicationTesting applicationTesting;

    public AppliesFor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public ApplicationTesting getApplicationTesting() {
        return applicationTesting;
    }

    public void setApplicationTesting(ApplicationTesting applicationTesting) {
        this.applicationTesting = applicationTesting;
    }
}
