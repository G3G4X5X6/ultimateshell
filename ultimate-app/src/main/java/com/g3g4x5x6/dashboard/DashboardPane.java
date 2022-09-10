package com.g3g4x5x6.dashboard;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.g3g4x5x6.MainFrame;
import com.g3g4x5x6.panel.RecentSessionsPanel;
import com.g3g4x5x6.panel.SessionManagerPanel;

import javax.swing.*;
import java.awt.*;


/**
 * 仪表盘面板
 */
public class DashboardPane extends JPanel {
    private BorderLayout borderLayout = new BorderLayout();
    private JTabbedPane tabbedPane = new JTabbedPane();

    public DashboardPane() {
        this.setLayout(borderLayout);

        tabbedPane.addTab("快速启动", new QuickStarterPane());
        tabbedPane.addTab("最近会话", new FlatSVGIcon("icons/ShowRecentTabStripItems(Color).svg"), new RecentSessionsPanel());
        tabbedPane.addTab("会话管理", new FlatSVGIcon("icons/addList.svg"), new SessionManagerPanel(MainFrame.mainTabbedPane));
        tabbedPane.addTab("备忘笔记", new NotePane());

        this.add(tabbedPane, BorderLayout.CENTER);
    }
}
