(ns four-clojure-answers.problem-040-test
  (:use four-clojure-answers.problem-040
        clojure.test))

(deftest problem-040-test
  (are [sep coll expected]
    (= (answer sep coll) expected)
    0 [1 2 3] [1 0 2 0 3]
    :z [:a :b :c :d] [:a :z :b :z :c :z :d])

  (is (= (apply str (answer ", " ["one" "two" "three"])) "one, two, three")))
