(ns four-clojure-answers.problem-021)

(def answer
  (fn [coll idx]
    (first (drop idx coll))))
