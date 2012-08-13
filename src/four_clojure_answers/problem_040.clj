(ns four-clojure-answers.problem-040)

(def answer
  (fn [sep coll]
    (butlast (interleave coll (repeat sep))))
