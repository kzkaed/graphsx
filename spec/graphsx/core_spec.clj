(ns graphsx.core-spec
  (:require [graphsx.core :as sut]
            [speclj.core :refer :all]))

(describe "describe the start of graphs"
  (context "starting foo"
    (it "just returns \"I don't do a whole lot.\""
      (should="I don't do a whole lot." (sut/foo)))))
