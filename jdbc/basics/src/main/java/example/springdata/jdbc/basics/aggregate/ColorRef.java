package example.springdata.jdbc.basics.aggregate;

import lombok.Builder;
import org.springframework.data.relational.core.mapping.Table;

@Table("lego_set_color")
@Builder
public class ColorRef {
	Long colorId;
}
