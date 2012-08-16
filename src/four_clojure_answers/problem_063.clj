(ns four-clojure-answers.problem-063)

(def answer
  (fn [f s]
    (apply merge-with concat
           (map (fn [x] {(f x) [x]}) s))))
