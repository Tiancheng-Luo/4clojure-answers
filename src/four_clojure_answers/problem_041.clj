(ns four-clojure-answers.problem-041)

(def answer
  (fn [coll n]
    (apply concat (partition-all (dec n) n coll))))
