# Usage

Install Leiningen. On Mac, you can use brew to install, or install directly
from [Leiningen Github page](https://github.com/technomancy/leiningen).

Install dependencies

    lein deps

Compile classes

    lein compile

Start server

    lein ring server

or
    lein run

# Niceties

Plugin for running nailgun server for VimClojure

    lein plugin install org.clojars.ibdknox/lein-nailgun 1.1.1

start with

    lein nailgun
