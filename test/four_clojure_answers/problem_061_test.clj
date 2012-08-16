(ns four-clojure-answers.problem-061-test
  (:use four-clojure-answers.problem-061
        clojure.test))

(deftest problem-061-test
  (are [ks vs expected]
    (= (answer ks vs) expected)
    [:a :b :c] [1 2 3] {:a 1, :b 2, :c 3}
    [1 2 3 4] ["one" "two" "three"] {1 "one", 2 "two", 3 "three"}
    [:foo :bar] ["foo" "bar" "baz"] {:foo "foo", :bar "bar"}))
