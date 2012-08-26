(ns four-clojure-answers.problem-122)

(def answer-a
  (fn [bit-str]
    (->> bit-str
      (re-seq #".")
      (map #(Integer/valueOf %))
      (reduce #(+ (* % 2) %2) 0))))

(def answer-b
  (fn [bit-str]
    (Integer/valueOf bit-str 2)))
