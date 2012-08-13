(ns four-clojure-answers.problem-040)

(def answer
  (fn [sep coll]
    (drop 1 (interleave (repeat sep) coll))))
