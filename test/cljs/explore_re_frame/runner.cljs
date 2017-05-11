(ns explore-re-frame.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [explore-re-frame.core-test]))

(doo-tests 'explore-re-frame.core-test)
