package View;

import controller.Controller;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import model.Activity;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jilyan
 */
public class View extends javax.swing.JFrame {

	/**
	 * Creates new form View
	 */
	private Controller controller = new Controller();

	public View() {
		initComponents();
		Tabs.setVisible(false);
		getContentPane().setBackground(Color.white);
		jCalendar1.setBackground(Color.white);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PageTitle = new javax.swing.JLabel();
        TBSep1 = new javax.swing.JSeparator();
        TBSep2 = new javax.swing.JSeparator();
        LRSep1 = new javax.swing.JSeparator();
        LRSep2 = new javax.swing.JSeparator();
        DateDisp = new javax.swing.JLabel();
        Today = new javax.swing.JButton();
        Day = new javax.swing.JButton();
        Agenda = new javax.swing.JButton();
        Create = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        Event = new javax.swing.JCheckBox();
        Task = new javax.swing.JCheckBox();
        Tabs = new javax.swing.JTabbedPane();
        CreateEvent = new javax.swing.JPanel();
        ActTitle = new javax.swing.JTextField();
        EventRb = new javax.swing.JRadioButton();
        TaskRb = new javax.swing.JRadioButton();
        Save = new javax.swing.JButton();
        Discard = new javax.swing.JButton();
        DateCreateL = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        FromCreateL = new javax.swing.JLabel();
        ToCreateL = new javax.swing.JLabel();
        FromHour = new javax.swing.JComboBox();
        FromMin = new javax.swing.JComboBox();
        ToHour = new javax.swing.JComboBox();
        ToMin = new javax.swing.JComboBox();
        FromCol = new javax.swing.JLabel();
        ToCol = new javax.swing.JLabel();
        DayPanel = new javax.swing.JScrollPane();
        DayScroll = new javax.swing.JPanel();
        AgendaPanel = new javax.swing.JScrollPane();
        AgendaScroll = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calendar");
        setBackground(java.awt.Color.white);
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1250, 550));
        getContentPane().setLayout(null);

        PageTitle.setFont(new java.awt.Font("High Tower Text", 0, 24)); // NOI18N
        PageTitle.setText("My Productivity Tool");
        getContentPane().add(PageTitle);
        PageTitle.setBounds(10, 10, 209, 40);
        getContentPane().add(TBSep1);
        TBSep1.setBounds(20, 62, 1170, 10);
        getContentPane().add(TBSep2);
        TBSep2.setBounds(20, 70, 1170, 10);

        LRSep1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(LRSep1);
        LRSep1.setBounds(360, 80, 10, 400);

        LRSep2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        LRSep2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        getContentPane().add(LRSep2);
        LRSep2.setBounds(370, 80, 10, 400);

        DateDisp.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        DateDisp.setText("03/13/2017");
        getContentPane().add(DateDisp);
        DateDisp.setBounds(390, 10, 100, 30);

        Today.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        Today.setText("Today");
        Today.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Today.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodayActionPerformed(evt);
            }
        });
        getContentPane().add(Today);
        Today.setBounds(270, 10, 90, 30);

        Day.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        Day.setLabel("Day");
        Day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayActionPerformed(evt);
            }
        });
        getContentPane().add(Day);
        Day.setBounds(950, 10, 100, 31);

        Agenda.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        Agenda.setText("Agenda");
        Agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendaActionPerformed(evt);
            }
        });
        getContentPane().add(Agenda);
        Agenda.setBounds(1070, 10, 100, 31);

        Create.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        getContentPane().add(Create);
        Create.setBounds(130, 80, 100, 31);

        jCalendar1.setBackground(new java.awt.Color(255, 255, 255));
        jCalendar1.setFont(new java.awt.Font("Calibri Light", 0, 10)); // NOI18N
        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });
        getContentPane().add(jCalendar1);
        jCalendar1.setBounds(0, 130, 360, 280);

        Event.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        Event.setText("Event");
        getContentPane().add(Event);
        Event.setBounds(30, 420, 81, 23);

        Task.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        Task.setText("Task");
        getContentPane().add(Task);
        Task.setBounds(30, 450, 81, 23);

        ActTitle.setFont(new java.awt.Font("Century", 0, 28)); // NOI18N
        ActTitle.setText("Activity Title");

        EventRb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        EventRb.setText("Event");
        EventRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventRbActionPerformed(evt);
            }
        });

        TaskRb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TaskRb.setText("Task");
        TaskRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskRbActionPerformed(evt);
            }
        });

        Save.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Discard.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Discard.setText("Discard");
        Discard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscardActionPerformed(evt);
            }
        });

        DateCreateL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DateCreateL.setText("Date : ");

        FromCreateL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FromCreateL.setText("From : ");

        ToCreateL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ToCreateL.setText("To : ");

        FromHour.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FromHour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        FromMin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FromMin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "30" }));

        ToHour.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ToHour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        ToMin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ToMin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "30" }));

        FromCol.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FromCol.setText(":");

        ToCol.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ToCol.setText(":");

        javax.swing.GroupLayout CreateEventLayout = new javax.swing.GroupLayout(CreateEvent);
        CreateEvent.setLayout(CreateEventLayout);
        CreateEventLayout.setHorizontalGroup(
            CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateEventLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Save)
                .addGap(18, 18, 18)
                .addComponent(Discard)
                .addGap(53, 53, 53))
            .addGroup(CreateEventLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateEventLayout.createSequentialGroup()
                        .addComponent(ToCreateL, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ToHour, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ToCol, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ToMin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TaskRb, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EventRb)
                    .addGroup(CreateEventLayout.createSequentialGroup()
                        .addComponent(DateCreateL, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CreateEventLayout.createSequentialGroup()
                        .addComponent(FromCreateL, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FromHour, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FromCol)
                        .addGap(18, 18, 18)
                        .addComponent(FromMin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(467, Short.MAX_VALUE))
            .addGroup(CreateEventLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ActTitle)
                .addContainerGap())
        );
        CreateEventLayout.setVerticalGroup(
            CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateEventLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(ActTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EventRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TaskRb)
                .addGap(39, 39, 39)
                .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateCreateL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(FromCreateL, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(FromCol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FromMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FromHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(ToHour)
                    .addComponent(ToCol)
                    .addComponent(ToMin)
                    .addComponent(ToCreateL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CreateEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(Discard))
                .addContainerGap())
        );

        Tabs.addTab("Create", CreateEvent);

        javax.swing.GroupLayout DayScrollLayout = new javax.swing.GroupLayout(DayScroll);
        DayScroll.setLayout(DayScrollLayout);
        DayScrollLayout.setHorizontalGroup(
            DayScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1485, Short.MAX_VALUE)
        );
        DayScrollLayout.setVerticalGroup(
            DayScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1392, Short.MAX_VALUE)
        );

        DayPanel.setViewportView(DayScroll);

        Tabs.addTab("Day", DayPanel);

        javax.swing.GroupLayout AgendaScrollLayout = new javax.swing.GroupLayout(AgendaScroll);
        AgendaScroll.setLayout(AgendaScrollLayout);
        AgendaScrollLayout.setHorizontalGroup(
            AgendaScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1485, Short.MAX_VALUE)
        );
        AgendaScrollLayout.setVerticalGroup(
            AgendaScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1392, Short.MAX_VALUE)
        );

        AgendaPanel.setViewportView(AgendaScroll);

        Tabs.addTab("Agenda", AgendaPanel);

        getContentPane().add(Tabs);
        Tabs.setBounds(380, 80, 810, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodayActionPerformed
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.now();
		DateDisp.setText(dtf.format(localDate));
    }//GEN-LAST:event_TodayActionPerformed

    private void DayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayActionPerformed
            try {
                DayScroll.removeAll();
                Tabs.setVisible(false);
                Tabs.setVisible(true);
                Tabs.setSelectedIndex(1);
                Tabs.setEnabledAt(0, false);
                Tabs.setEnabledAt(2, false);
                Tabs.setEnabledAt(1, true);
                String d = DateDisp.getText();
                ArrayList<Activity> eventList = getData(d);
                JLabel[] labelT = new JLabel[24];
                
                for (int i = 0; i < 24; ++i) {
                    labelT[i] = new JLabel();
                    labelT[i].setBounds(0, i * 56, 63, 56);
                    if (i < 10) {
                        labelT[i].setText("0" + i + ":00");
                    } else {
                        labelT[i].setText(i + ":00");
                    }
                    labelT[i].setFont(new java.awt.Font("Century", 0, 18));
                    labelT[i].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    labelT[i].setVerticalAlignment(javax.swing.SwingConstants.TOP);
                    labelT[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    DayScroll.add(labelT[i]);
                }
                
                javax.swing.JCheckBox[] done = new javax.swing.JCheckBox[48];
                JButton[] labelN = new JButton[48];
                int j = 0;
                int loop;
                int start;
                
                for (int i = 0; i < 48; ++i) {
                    
                    done[i] = new javax.swing.JCheckBox();
                    done[i].setBounds(690, i * 28, 20, 28);
                    done[i].setSelected(false);
                    done[i].setEnabled(false);
                    
                    labelN[i] = new JButton();
                    labelN[i].setBounds(67, i * 28, 600, 28);
                    labelN[i].setEnabled(false);
                    
                    if (j < eventList.size()) {
                        start = eventList.get(j).getlStart().getHour() * 2;
                        if (eventList.get(j).getlStart().getMinute() == 30) {
                            ++start;
                        }
                        if (start == i) {
                            loop = 1;
                            if (eventList.get(j).getlEnd() != null) {
                                loop = (eventList.get(j).getlEnd().getHour() - eventList.get(j).getlStart().getHour()) * 2;
                                if ((eventList.get(j).getlEnd().getMinute() - eventList.get(j).getlStart().getMinute()) < 0) {
                                    --loop;
                                } else if ((eventList.get(j).getlEnd().getMinute() - eventList.get(j).getlStart().getMinute()) > 0) {
                                    ++loop;
                                }
                            }
                            
                            while (loop > 0) {
                                done[i] = new javax.swing.JCheckBox();
                                done[i].setBounds(690, i * 28, 20, 28);
                                done[i].setSelected(false);
                                done[i].setEnabled(false);
                                
                                labelN[i] = new JButton();
                                labelN[i].setBounds(67, i * 28, 600, 28);
                                labelN[i].setEnabled(true);
                                ActivityButtonClicked(eventList.get(j), labelN[i]);
                                
                                if (eventList.get(j).getDone().equalsIgnoreCase("Done")) {
                                    done[i].setSelected(true);
                                    labelN[i].setFont(new java.awt.Font("Century", 3, 18));
                                } else {
                                    labelN[i].setFont(new java.awt.Font("Century", 0, 18));
                                }
                                
                                if (eventList.get(j).getEventType().equalsIgnoreCase("Event")) {
                                    labelN[i].setOpaque(true);
                                    labelN[i].setBackground(Color.blue);
                                } else {
                                    labelN[i].setOpaque(true);
                                    labelN[i].setBackground(Color.green);
                                }
                                labelN[i].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                                DayScroll.add(labelN[i]);
                                DayScroll.add(done[i]);
                                --loop;
                                ++i;
                            }
                            labelN[start].setText(eventList.get(j).getEventName());
                            labelN[start].setForeground(Color.white);
                            done[i] = new javax.swing.JCheckBox();
                            done[i].setBounds(690, i * 28, 20, 28);
                            done[i].setSelected(false);
                            done[i].setEnabled(false);
                            
                            labelN[i] = new JButton();
                            labelN[i].setBounds(67, i * 28, 600, 28);
                            labelN[i].setEnabled(false);
                            ++j;
                        } else {
                            labelN[i].setText("");
                        }
                    }
                    
                    labelN[i].setFont(new java.awt.Font("Century", 0, 18));
                    labelN[i].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                    DayScroll.add(labelN[i]);
                    DayScroll.add(done[i]);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_DayActionPerformed

	private void ActivityButtonClicked(Activity act, JButton button) {
		button.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JFrame Popup = new JFrame();
				Popup.setBounds(400, 85, 450, 100);

				JPanel Edit = new JPanel();
				Edit.setBounds(400, 85, 450, 100);

				JLabel EditTitle = new JLabel();
				EditTitle.setBounds(50, 30, 200, 50);
				EditTitle.setText(act.getEventName());
				EditTitle.setFont(new java.awt.Font("Century", 0, 18));
				Edit.add(EditTitle);

				JButton EditDone = new JButton();
				EditDone.setBounds(50, 130, 110, 40);
				EditDone.setText("Done");
				EditDone.setFont(new java.awt.Font("Century", 0, 18));
				Edit.add(EditDone);

				JButton EditDelete = new JButton();
				EditDelete.setBounds(240, 130, 110, 40);
				EditDelete.setText("Delete");
				EditDelete.setFont(new java.awt.Font("Century", 0, 18));
				Edit.add(EditDelete);

				Popup.add(Edit);
				Popup.setVisible(true);

				if (act.getEventType().equalsIgnoreCase("Event")) {
					EditDone.setEnabled(false);
				}

				EditDoneClicked(act, EditDone, Popup);
				EditDeleteClicked(act, EditDelete, Popup);
			}
		});
	}

	private void EditDoneClicked(Activity act, JButton button, JFrame Popup) {
		button.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (act.getDone().equalsIgnoreCase("Done")) {
					try {
						controller.markDone(act, "notDone");
					} catch (FileNotFoundException ex) {
						Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
					}
				} else {
					try {
						controller.markDone(act, "Done");
					} catch (FileNotFoundException ex) {
						Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
				Popup.dispose();
			}
		});
	}

	private void EditDeleteClicked(Activity act, JButton button, JFrame Popup) {
		button.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					controller.deleteActivity(act);
				} catch (FileNotFoundException ex) {
					Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
				}
				Popup.dispose();
			}
		});
	}

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
		Tabs.setEnabledAt(1, false);
		Tabs.setEnabledAt(2, false);
		Tabs.setEnabledAt(0, true);
		Tabs.setVisible(false);
		Tabs.setVisible(true);
		Tabs.setSelectedIndex(0);
    }//GEN-LAST:event_CreateActionPerformed

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
		String d = sdf.format(jCalendar1.getDate());
		DateDisp.setText(d);
    }//GEN-LAST:event_jCalendar1PropertyChange

    private void EventRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventRbActionPerformed
		if (EventRb.isSelected()) {
			TaskRb.setSelected(false);
			ToHour.setVisible(true);
			ToMin.setVisible(true);
			ToCreateL.setVisible(true);
		}
    }//GEN-LAST:event_EventRbActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
		String d = sdf.format(jDateChooser1.getDate());
		String title = ActTitle.getText();
		String type;
		if (EventRb.isSelected()) {
			type = "Event";
		} else {
			type = "Task";
		}
		LocalTime start = controller.convertTime(FromHour.getSelectedIndex(), FromMin.getSelectedIndex() * 30);
		LocalTime end = null;
		if (type.equalsIgnoreCase("Event")) {
			end = controller.convertTime(ToHour.getSelectedIndex(), FromMin.getSelectedIndex() * 30);
		}

		try {
			controller.createEvent(title, d, type, start, end, "notdone");
		} catch (FileNotFoundException ex) {
			Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
		}
		resetCreatePanel();
    }//GEN-LAST:event_SaveActionPerformed

    private void TaskRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskRbActionPerformed
		if (TaskRb.isSelected()) {
			EventRb.setSelected(false);
			ToHour.setVisible(false);
			ToMin.setVisible(false);
			ToCreateL.setVisible(false);
		}
    }//GEN-LAST:event_TaskRbActionPerformed

	private void resetCreatePanel() {
		Tabs.setVisible(false);
		ActTitle.setText("Activity Title");
		EventRb.setSelected(false);
		TaskRb.setSelected(false);
		jDateChooser1.setDate(null);
		FromHour.setSelectedIndex(0);
		ToHour.setSelectedIndex(0);
		FromMin.setSelectedIndex(0);
		ToMin.setSelectedIndex(0);
	}

    private void DiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscardActionPerformed
		resetCreatePanel();
    }//GEN-LAST:event_DiscardActionPerformed

	private ArrayList<Activity> getData(String d) throws FileNotFoundException {
		ArrayList<Activity> eventList;
		if (Event.isSelected() && !Task.isSelected()) {
			eventList = controller.viewActivities(d, "Event");
		} else if (Task.isSelected() && !Event.isSelected()) {
			eventList = controller.viewActivities(d, "Task");
		} else {
			eventList = controller.viewActivities(d, "All");
		}
		return eventList;
	}

    private void AgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendaActionPerformed
            try {
                AgendaScroll.removeAll();
                Tabs.setVisible(false);
                Tabs.setVisible(true);
                Tabs.setSelectedIndex(2);
                Tabs.setEnabledAt(0, false);
                Tabs.setEnabledAt(1, false);
                Tabs.setEnabledAt(2, true);
                String d = DateDisp.getText();
                ArrayList<Activity> eventList = getData(d);
                JLabel[][] label = new JLabel[eventList.size()][2];
                
                for (int i = 0; i < eventList.size(); ++i) {
                    label[i][0] = new JLabel();
                    label[i][0].setBounds(0, i * 28, 116, 28);
                    label[i][0].setText(eventList.get(i).getTime());
                    label[i][0].setFont(new java.awt.Font("Century", 0, 18));
                    AgendaScroll.add(label[i][0]);
                    
                    label[i][1] = new JLabel();
                    label[i][1].setBounds(120, i * 28, 669, 28);
                    label[i][1].setText(eventList.get(i).getEventName());
                    if (eventList.get(i).getDone().equalsIgnoreCase("Done")) {
                        label[i][1].setFont(new java.awt.Font("Century", 3, 18));
                    } else {
                        label[i][1].setFont(new java.awt.Font("Century", 0, 18));
                    }
                    AgendaScroll.add(label[i][1]);
                    
                    if (eventList.get(i).getEventType().equalsIgnoreCase("Event")) {
                        label[i][1].setForeground(Color.blue);
                    } else {
                        label[i][1].setForeground(Color.green);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_AgendaActionPerformed

    public void start() {
	/* Set the Nimbus look and feel */
	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(() -> {
            new View().setVisible(true);
            controller.importActivities();    
	});
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActTitle;
    private javax.swing.JButton Agenda;
    private javax.swing.JScrollPane AgendaPanel;
    private javax.swing.JPanel AgendaScroll;
    private javax.swing.JButton Create;
    private javax.swing.JPanel CreateEvent;
    private javax.swing.JLabel DateCreateL;
    private javax.swing.JLabel DateDisp;
    private javax.swing.JButton Day;
    private javax.swing.JScrollPane DayPanel;
    private javax.swing.JPanel DayScroll;
    private javax.swing.JButton Discard;
    private javax.swing.JCheckBox Event;
    private javax.swing.JRadioButton EventRb;
    private javax.swing.JLabel FromCol;
    private javax.swing.JLabel FromCreateL;
    private javax.swing.JComboBox FromHour;
    private javax.swing.JComboBox FromMin;
    private javax.swing.JSeparator LRSep1;
    private javax.swing.JSeparator LRSep2;
    private javax.swing.JLabel PageTitle;
    private javax.swing.JButton Save;
    private javax.swing.JSeparator TBSep1;
    private javax.swing.JSeparator TBSep2;
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JCheckBox Task;
    private javax.swing.JRadioButton TaskRb;
    private javax.swing.JLabel ToCol;
    private javax.swing.JLabel ToCreateL;
    private javax.swing.JComboBox ToHour;
    private javax.swing.JComboBox ToMin;
    private javax.swing.JButton Today;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    // End of variables declaration//GEN-END:variables
}