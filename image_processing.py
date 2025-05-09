import cv2

def show_processing_stages(image):
    gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
    cv2.imshow("Grayscale", gray)

    _, thresh = cv2.threshold(gray, 120, 255, cv2.THRESH_BINARY)
    cv2.imshow("Threshold", thresh)

    contours, _ = cv2.findContours(thresh, cv2.RETR_TREE, cv2.CHAIN_APPROX_SIMPLE)
    outline = image.copy()
    cv2.drawContours(outline, contours, -1, (0, 255, 0), 2)
    cv2.imshow("Contours", outline)