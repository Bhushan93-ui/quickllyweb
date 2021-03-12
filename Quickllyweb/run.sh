#!/bin/bash
javadoc -docletpath target/Quickllyweb-0.0.1-SNAPSHOT-jar-with-dependencies.jar -doclet Quicklly.Quickllyweb.Doclet "$@"
