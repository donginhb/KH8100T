#ifndef RDBOPERFRAME_H
#define RDBOPERFRAME_H

#include <Ice/Ice.h>
#include <QtWidgets/QMainWindow>

#include "configIceDialog.h"
#include "rdbdata.h"

class QAction;
class QListView;
class QTableView;

using namespace RdbRealData;

class RdbOperFrame : public QMainWindow
{
	Q_OBJECT

public:
	RdbOperFrame(QWidget *parent = 0);
	~RdbOperFrame();

	// 重新获取实时库操作代理
	RdbDataOptPrx regetRdbDataOptPrx();

private:
	void createWidget();
	void createActions();
	QAction*	createActionImpl(const QIcon& icon, const QString& text, const QString& statusTip, const char* slot);
	void createMenus();
	void createToolBars();
	void createStatusBar();

	void initIcePtr();
	bool getRdbDataOptPrx();
	void updateActions();

private slots:
	void configServer();
	void startServer();
	void stopServer();
	void selectDefaultData();
	void selectSpecficData();
	void selectCompleteData();
	void selectEquipmentTree();
	void addRecord();
	void updateRecord();
	void deleteRecord();
	void randomInsert();
	void structInsert();
	void structInsertFinished();
	void efficiencyAnalyse();
	void updateTableView();
	void updateStatusBar(const QString& text, int timeout = 2000);

private:
	QAction*	quitAppAction;

	QAction*	configServerAction;
	QAction*	startServerAction;
	QAction*	stopServerAction;

	QAction*	addRecordAction;
	QAction*	deleteRecordAction;
	QAction*	updateRecordAction;
	QAction*	refreshRecordsAction;
	QAction*	selectDefaultDataAction;
	QAction*	selectSpecficDataAction;
	QAction*	selectCompleteDataAction;
	QAction*	selectEquipTreeAction;

	QAction*	randomInsertAction;
	QAction*	structInsertAction;

	QAction*	analyseAction;

	QListView*	listView;
	QTableView*	tableView;

	QString					m_adapterIdentify;
	ConfigIceInfo			m_configIceInfo;
	Ice::CommunicatorPtr	m_communicatorPtr;
	Ice::ObjectAdapterPtr	m_objectAdapterPtr;
	RdbDataOptPrx			m_rdbDataOptPrx;
};

#endif // RDBOPERFRAME_H
