Code is hosted on GitHub at: `github.com/NSC-david-sasaki/AD300-WK9-Comparators`

Source Code is available at:
`AD300-WK9-Comparators/src/main/java/org/example/*.java`

Test Code is available at:
`AD300-WK9-Comparators/test/main/java/org/example`

Output from running main:
```Bash
Sorted by Title:
Author: Jonathan Levin - Title: Android Internals: Implementor's View - Year Published: 2022
Author: Reges & Stepp - Title: Building Java Proograms - Year Published: 2017
Author: Winters, Manshreck, Wright - Title: Software Engineering at Google - Year Published: 2020
Author: Michael Kerrisk - Title: The Linux Programming Interface - Year Published: 2010

Sorted by Author:
Author: Jonathan Levin - Title: Android Internals: Implementor's View - Year Published: 2022
Author: Michael Kerrisk - Title: The Linux Programming Interface - Year Published: 2010
Author: Reges & Stepp - Title: Building Java Proograms - Year Published: 2017
Author: Winters, Manshreck, Wright - Title: Software Engineering at Google - Year Published: 2020

Sorted by Year:
Author: Jonathan Levin - Title: Android Internals: Implementor's View - Year Published: 2022
Author: Winters, Manshreck, Wright - Title: Software Engineering at Google - Year Published: 2020
Author: Reges & Stepp - Title: Building Java Programs - Year Published: 2017
Author: Michael Kerrisk - Title: The Linux Programming Interface - Year Published: 2010

Sorted by Author then Title:
Author: Jonathan Levin - Title: Android Internals: Implementor's View - Year Published: 2022
Author: Michael Kerrisk - Title: The Linux Programming Interface - Year Published: 2010
Author: Reges & Stepp - Title: Building Java Proograms - Year Published: 2017
Author: Winters, Manshreck, Wright - Title: Software Engineering at Google - Year Published: 2020
```

## Feature Summary

* Added Author Comparator: allows query by author's name. Detailed schema is not yet defined for Author field.
The Author Comparator uses the Author's name as listed in the Book's class. No data valiidation is performed to confirm 
first name vs last name, vs multiple authors.

* Added Chained Comparator: Combines the Author Compartor with Title  Compartor to refine results. Useful when author's
last name is common.

* Added Year Comparator: allows query by the year the book was published. The Book class does not have an edition field.
Sorting books with multiple editions may not provide a satisfying customer experience.
