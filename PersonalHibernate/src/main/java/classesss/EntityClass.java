package classesss;

import javax.persistence.*;

@Entity
@Table(name = "your_table")
public class EntityClass {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "name")
	    private String name;

}


