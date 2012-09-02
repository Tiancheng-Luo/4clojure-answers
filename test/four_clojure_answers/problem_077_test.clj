(ns four-clojure-answers.problem-077-test
  (:use four-clojure-answers.problem-077
        clojure.test))

(deftest problem-077-test
  (are [coll expected]
    (= (answer coll) expected)
    ["meat" "mat" "team" "mate" "eat"]
    #{#{"meat" "team" "mate"}}

    ["veer" "lake" "item" "kale" "mite" "ever"]
    #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}}))
