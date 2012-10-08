(ns four-clojure-answers.problem-103-test
  (:use four-clojure-answers.problem-103
        clojure.test))

(deftest problem-103-test
  (are [n s expected]
    (= (answer n s) expected)
    1 #{4 5 6}
    #{#{4} #{5} #{6}}

    10 #{4 5 6}
    #{}

    2 #{0 1 2}
    #{#{0 1} #{0 2} #{1 2}}

    3 #{0 1 2 3 4}
    #{#{0 1 2} #{0 1 3} #{0 1 4} #{0 2 3} #{0 2 4}
      #{0 3 4} #{1 2 3} #{1 2 4} #{1 3 4} #{2 3 4}}

    4 #{[1 2 3] :a "abc" "efg"}
    #{#{[1 2 3] :a "abc" "efg"}}

    2 #{[1 2 3] :a "abc" "efg"}
    #{#{[1 2 3] :a} #{[1 2 3] "abc"} #{[1 2 3] "efg"}
      #{:a "abc"} #{:a "efg"} #{"abc" "efg"}}))
