import numpy as np

years = np.array(['Year 1', 'Year 2', 'Year 3', 'Year 4', 'Year 5'])
roi = np.array([10, 25, 50, 80, 120])  # ROI percentages

plt.figure(figsize=(10, 6))
plt.bar(years, roi, color='green', alpha=0.7)
plt.title('DataWise AI ROI Forecast (5 Years)')
plt.xlabel('Time Period')
plt.ylabel('ROI (%)')
plt.grid(True, axis='y')

plt.savefig('roi_forecast.png')