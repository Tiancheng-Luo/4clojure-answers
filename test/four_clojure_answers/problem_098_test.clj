(ns four-clojure-answers.problem-098-test
  (:use four-clojure-answers.problem-098
        clojure.test))

(deftest problem-098-test
  (are [f s expected]
    (= (answer f s) expected)

    #(* % %) #{-2 -1 0 1 2}
    #{#{0} #{1 -1} #{2 -2}}

    #(rem % 3) #{0 1 2 3 4 5}
    #{#{0 3} #{1 4} #{2 5}}

    identity #{0 1 2 3 4}
    #{#{0} #{1} #{2} #{3} #{4}}

    (constantly true) #{0 1 2 3 4}
    #{#{0 1 2 3 4}}))
