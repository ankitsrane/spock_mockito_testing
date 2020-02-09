package extensions

import com.example.spring.tutorials.testing.spockmocks.ItemService
import spock.lang.Specification
import spock.lang.Subject


class SubjectTest extends Specification {

    @Subject
    ItemService itemService // initialization here...

}
