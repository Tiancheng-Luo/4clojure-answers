(ns four-clojure-answers.problem-107)

(def answer-a
  (fn [n]
    (comp
      (partial reduce *)
      (partial repeat n))))

(def answer-b
  (fn [n]
    (fn [m]
      (long (Math/pow m n)))))
