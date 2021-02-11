from __future__ import division
import cv2

from cv2 import imread
from cv2 import imshow
from cv2 import waitKey
from cv2 import destroyAllWindows
from cv2 import CascadeClassifier
from cv2 import rectangle

def dimension(fn):

	classifier = cv2.CascadeClassifier('haarcascade_frontalface_default.xml')
	img = cv2.imread('/data/user/0/com.samsung.et10/files/pics/0'+ fn)

	bboxes = classifier.detectMultiScale(img)
	for box in bboxes:
		box

	x, y, width, height = box
	x2, y2 = x + width, y + height
	return [width, height]
