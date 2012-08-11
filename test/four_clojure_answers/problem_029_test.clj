(ns four-clojure-answers.problem-029-test
  (:use four-clojure-answers.problem-029
        clojure.test))

(deftest problem-029-test
  (are [coll expected]
    (= (answer coll) expected)
    "HeLlO, WoRlD!"  "HLOWRD"
    "nothing" ""
    "$#A(*&987Zf" "AZ"))
